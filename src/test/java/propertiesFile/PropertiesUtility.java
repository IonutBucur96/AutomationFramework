package propertiesFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesUtility {

    //in aceasta clasa vom incarca un fisier de tipul properties
    private Properties properties;
    private FileInputStream fileInputStream;

    public PropertiesUtility(){
        loadFile();
    }

    public void loadFile() {
        properties = new Properties();
        try {
            fileInputStream = new FileInputStream("src/test/resources/testData.properties");
            properties.load(fileInputStream);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //fac o metoda care imi returneaza toate key-value din fisierul de properties
    public HashMap<String,String> getAllData(){
        HashMap<String, String> testData = new HashMap<>();
        for (Object key: properties.keySet()){
            testData.put(key.toString(), properties.getProperty(key.toString()));
        }
        return testData;
    }

}
