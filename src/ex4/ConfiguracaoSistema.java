package ex4;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instance;

    private String urlBanco;
    private String nomeApp;
    private String ambienteExec;
    private String chaveAPI;

    public ConfiguracaoSistema() {
        this.urlBanco = "Exemplo.com";
        this.nomeApp = "Biazotto Lindo";
        this.ambienteExec = "Prod";
        this.chaveAPI = "Achou";
    }

    public static ConfiguracaoSistema getInstance(){
        if(instance == null){
            instance = new ConfiguracaoSistema();
        }

        return instance;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public void setUrlBanco(String urlBanco) {
        this.urlBanco = urlBanco;
    }

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

    public String getAmbienteExec() {
        return ambienteExec;
    }

    public void setAmbienteExec(String ambienteExec) {
        this.ambienteExec = ambienteExec;
    }

    public String getChaveAPI() {
        return chaveAPI;
    }

    public void setChaveAPI(String chaveAPI) {
        this.chaveAPI = chaveAPI;
    }
}
