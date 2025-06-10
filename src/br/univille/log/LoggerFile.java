package br.univille.log;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class LoggerFile implements Logger {
    @Override
    public void log(Level level, String mensagem) {
        String filename = "teste.txt";
        String texto = dataHoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) + " Level:"+level+" Mensagem: " + mensagem;
        try {
            Files.write(Paths.get(filename)
                    , mensagem.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo");
            e.printStackTrace();
        }
    }
}

