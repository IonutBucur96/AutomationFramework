package objectData;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class RegisterObject {

    private String firstNameValue;
    private String lastNameValue;
    private String addressValue;
    private String emailValue;
    private String phoneValue;
    private String skillValue;
    private String yearValue;
    private String monthValue;
    private String passwordValue;
    private String confirmPasswordValue;
    private List<String> languageValues;

    public RegisterObject(HashMap<String, String> testData){
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "firstNameValue":
                    setFirstNameValue(testData.get(key));
                    break;
                case "lastNameValue":
                    setLastNameValue(testData.get(key));
                    break;
                case "addressValue":
                    setAddressValue(testData.get(key));
                    break;
                case "emailValue":
                    setEmailValue(testData.get(key));
                    break;
                case "phoneValue":
                    setPhoneValue(testData.get(key));
                    break;
                case "skillValue":
                    setSkillValue(testData.get(key));
                    break;
                case "yearValue":
                    setYearValue(testData.get(key));
                    break;
                case "monthValue":
                    setMonthValue(testData.get(key));
                    break;
                case "passwordValue":
                    setPasswordValue(testData.get(key));
                    break;
                case "confirmPasswordValue":
                    setConfirmPasswordValue(testData.get(key));
                    break;
                case "languageValues":
                    setLanguageValues(testData.get(key));
                    break;
            }
        }
    }

    public String getFirstNameValue() {
        return firstNameValue;
    }

    public void setFirstNameValue(String firstNameValue) {
        this.firstNameValue = firstNameValue;
    }

    public String getLastNameValue() {
        return lastNameValue;
    }

    public void setLastNameValue(String lastNameValue) {
        this.lastNameValue = lastNameValue;
    }

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(String skillValue) {
        this.skillValue = skillValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getPasswordValue() {
        return passwordValue;
    }

    public void setPasswordValue(String passwordValue) {
        this.passwordValue = passwordValue;
    }

    public String getConfirmPasswordValue() {
        return confirmPasswordValue;
    }

    public void setConfirmPasswordValue(String confirmPasswordValue) {
        this.confirmPasswordValue = confirmPasswordValue;
    }

    public List<String> getLanguageValues() {
        return languageValues;
    }

    public void setLanguageValues(String languageValues) {
        String[] languageArray = languageValues.split(",");
        //facem o conversie de la un array la o lista
        this.languageValues = Arrays.asList(languageArray);
    }
}
