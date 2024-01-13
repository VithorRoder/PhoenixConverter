package mt2converter;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
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
        JOptionPane.showMessageDialog(null,
                "Uma versão mais recente está disponível. Por favor, faça o download da versão mais recente.",
                "Atualização Disponível",
                JOptionPane.INFORMATION_MESSAGE);

        // Pode encerrar o programa aqui ou redirecionar para a página de download, etc.
        System.exit(0);
    }
}
