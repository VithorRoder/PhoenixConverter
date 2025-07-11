package Atualizador;

import javax.swing.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Atualizador {

    private static final String VERSAO_ATUAL = "1.0.4";
    private static final String JSON_URL = "https://raw.githubusercontent.com/VithorRoder/PhoenixConverter/master/versao.json";

    public static void checarAtualizacao() {
        try {
            // Baixa o conteúdo do JSON
            HttpURLConnection con = (HttpURLConnection) new URL(JSON_URL).openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder json = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                json.append(linha);
            }
            reader.close();

            // Pega versão e URL de download
            String jsonStr = json.toString();
            String versaoOnline = jsonStr.split("\"latest\":")[1].split("\"")[1];
            String urlDownload = jsonStr.split("\"url\":")[1].split("\"")[1];

            // Se for versão nova, oferece para instalar
            if (!VERSAO_ATUAL.equals(versaoOnline)) {
                int opcao = JOptionPane.showConfirmDialog(null,
                        "Nova versão disponível (" + versaoOnline + "). Deseja instalar agora?",
                        "Atualização", JOptionPane.YES_NO_OPTION);

                if (opcao == JOptionPane.YES_OPTION) {
                    atualizarAplicacao(urlDownload);
                }
            }

        } catch (Exception e) {
            System.err.println("Erro ao verificar atualização: " + e.getMessage());
        }
    }

    private static void atualizarAplicacao(String downloadUrl) throws Exception {
        File arquivoTemporario = File.createTempFile("instalador", ".exe");

        HttpURLConnection con = (HttpURLConnection) new URL(downloadUrl).openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        InputStream in = con.getInputStream();
        Files.copy(in, arquivoTemporario.toPath(), StandardCopyOption.REPLACE_EXISTING);
        in.close();

        // Executa o instalador com "/silent"
        Runtime.getRuntime().exec("cmd /c \"" + arquivoTemporario.getAbsolutePath() + "\" /silent");

        // Fecha o app atual
        System.exit(0);
    }
}
