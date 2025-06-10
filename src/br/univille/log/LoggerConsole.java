package br.univille.log;

class LoggerConsole implements Logger {
    private static final String RESET = "\u001B[0m";
    private static final String RED = "\u001B[31m";
    private static final String YELLOW = "\u001B[33m";
    private static final String GREEN = "\u001B[32m";

    @Override
    public void log(Level level, String mensagem) {
        String color="";      
        ZoneDateTime dataHoraZona = ZonedDateTime.now();
    
        switch (level) {
            case ERROR:
                color = RED;
                break;
            case WARNING:
                color = YELLOW;
                break;
            case DEBUG:
                color = GREEN;
                break;
            default:
                color = RESET;
        }
        System.out.println(color + dataHoraZona.withZoneSameInstant(ZoneId.of("America/Sao_Paulo")) + "Level:"+level+" Mensagem: " + mensagem + RESET);
    }
}
