package objectData;

import java.util.HashMap;

public class AlertObject {

    private String alertValue;

    public AlertObject(HashMap<String, String> testData){
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "alertValue":
                    setAlertValue(testData.get(key));
                    break;
            }
        }
    }

    public String getAlertValue() {
        return alertValue;
    }

    public void setAlertValue(String alertValue) {
        this.alertValue = alertValue;
    }
}
