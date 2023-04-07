package objectData;

import java.util.HashMap;

public class LoginObject {

    private String loginEmail;
    private String loginPassword;
    private String loginErrorMessage;

    public LoginObject(HashMap<String, String> testData){
        populateData(testData);
    }

    //facem logica care parcurge multimea de key-value si mapeaza valorile in variabilele din aceasta clasa
    public void populateData(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "loginEmail":
                    setLoginEmail(testData.get(key));
                    break;
                case "loginPassword":
                    setLoginPassword(testData.get(key));
                    break;
                case "loginErrorMessage":
                    setLoginErrorMessage(testData.get(key));
                    break;
            }
        }
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public void setLoginEmail(String loginEmail) {
        this.loginEmail = loginEmail;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getLoginErrorMessage() {
        return loginErrorMessage;
    }

    public void setLoginErrorMessage(String loginErrorMessage) {
        this.loginErrorMessage = loginErrorMessage;
    }

}
