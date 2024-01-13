package mt2converter;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Vithor Roder
 */
public class PhoenixConverter {

    public static void main(String[] args) {
        FlatDarkLaf.setup();

        if (verificarAtualizacao()) {
            exibirMensagemAtualizacao();
        } else {
            JFrame frame = new FramePhoenixConverter();
            frame.setVisible(true);
        }
    }

    private static boolean verificarAtualizacao() {
        try {
            URL url = new URL("https://api.github.com/repos/VithorRoder/PhoenixConverter/releases/latest");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept", "application/vnd.github.v3+json");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String responseBody = reader.readLine();

                // Analisar a resposta JSON para obter a versão mais recente
                // Supondo que o campo "tag_name" contenha a versão
                String versaoMaisRecente = responseBody.split("\"tag_name\":\"")[1].split("\"")[0];

                // Comparar com a versão local
                String versaoLocal = obterVersaoLocal(); // Implemente essa função
                if (!versaoMaisRecente.equals(versaoLocal)) {
                    return true; // Retorna true se uma atualização estiver disponível
                }
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; // Retorna false se não houver atualização disponível
    }

    private static String obterVersaoLocal() {
        // Implemente a lógica para obter a versão local do seu aplicativo
        // Pode ser a partir de um arquivo, propriedades, etc.
        return "1.0.0"; // Substitua pelo método real de obtenção da versão local
    }

    private static void exibirMensagemAtualizacao() {
        int opcao = JOptionPane.showConfirmDialog(null,
                "Uma versão mais recente está disponível. Deseja fazer o download e instalar agora?",
                "Atualização Disponível",
                JOptionPane.YES_NO_OPTION);

        if (opcao == JOptionPane.YES_OPTION) {
            abrirLinkDownload();
            System.exit(0); // Encerra o programa após o usuário escolher fazer o download
        } else {
            // Continua com o programa
            JFrame frame = new FramePhoenixConverter();
            frame.setVisible(true);
        }
    }

    private static void abrirLinkDownload() {
        try {
            URI uri = new URI("https://github.com/VithorRoder/PhoenixConverter/archive/refs/tags/1.0.1.zip");
            Desktop.getDesktop().browse(uri);
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
