package objectData;

import java.util.HashMap;

public class FrameObject {

    private String singleFrame;
    private String multipleFrame;

    public FrameObject(HashMap<String, String> testData){
        populateData(testData);
    }

    public void populateData(HashMap<String, String> testData){
        for (String key: testData.keySet()){
            switch (key){
                case "singleFrame":
                    setSingleFrame(testData.get(key));
                    break;
                case "multipleFrame":
                    setMultipleFrame(testData.get(key));
                    break;
            }
        }
    }

    public String getSingleFrame() {
        return singleFrame;
    }

    public void setSingleFrame(String singleFrame) {
        this.singleFrame = singleFrame;
    }

    public String getMultipleFrame() {
        return multipleFrame;
    }

    public void setMultipleFrame(String multipleFrame) {
        this.multipleFrame = multipleFrame;
    }
}
