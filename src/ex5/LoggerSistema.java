package ex5;

public class LoggerSistema {

    private static LoggerSistema instance;

    public LoggerSistema() {
    }

    public static LoggerSistema getInstance(){
        if (instance == null){
            instance = new LoggerSistema();
        }

        return instance;
    }

    public void log(String mensagem){
        System.out.println(mensagem);
    }
}
