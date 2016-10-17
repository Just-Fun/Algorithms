package ua.com.serzh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Serzh on 10/12/16.
 */
public class MapToJson {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        map.put("name", 44);
        map.put("age", 29);

      /*  String json = jsonEachMapNewRow(map);
        System.out.println(json);

        String json2 = jsonOneRow(map);
        System.out.println(json2);

        String path = "src/main/temp/jsonTemp.txt";
        jsonToFile(path, map);

        File file = new File("src/main/temp/jsonOSTemp.txt");
        String content = "This is the text content";

        writeInFile(file, content);*/

        PreparedStatement ps = null;
      /*  try {
            // serialize your map
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            ObjectOutputStream output = new ObjectOutputStream(b);
            output.writeObject(map.getHashes());

            ps = this.connection.prepareStatement("INSERT INTO myobjects (hashes) VALUES (?)");
            ps.setBinaryStream(1, new ByteArrayInputStream(b.toByteArray()));
            ps.executeUpdate();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        } finally {
            DAOUtility.close(this.connection, ps);
        }*/
    }

    public InputStream convertMapToJsonBytes(Map<String, Integer> map) {
        InputStream stream = null;
        try {
            stream = new ByteArrayInputStream(convertObjectToJsonBytes(map));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stream;
    }

    public static byte[] convertObjectToJsonBytes(Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return mapper.writeValueAsBytes(object);
    }

    public static Map<String, Object> InputStreamIntoJSON(InputStream inputStream) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> jsonMap = mapper.readValue(inputStream, Map.class);
        return jsonMap;
    }



    public static void jsonToOutputStream(OutputStream out, Map<String, Integer> map) {
        ObjectMapper mapper = new ObjectMapper();
        try {
//            mapper.writeValue(out, map);
            mapper.writeValue(out, map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeInFile(File file, String content) {
        try (FileOutputStream fop = new FileOutputStream(file)) {
            if (!file.exists()) {
                file.createNewFile();
            }
            Map<String, Integer> map = new HashMap<>();
            map.put("name", 44);
            map.put("age", 29);

            jsonToOutputStream(fop, map);

            // get the content in bytes
//            byte[] contentInBytes = content.getBytes();

//            fop.write(contentInBytes);
            fop.flush();
            fop.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void jsonToFile(String path, Map<String, Integer> map) {
        ObjectMapper mapper = new ObjectMapper();
        // write JSON to a file
        try {
            mapper.writeValue(new File(path), map);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String jsonEachMapNewRow(Map<String, Integer> map) {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();

        try {
            json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static String jsonOneRow(Map<String, Integer> map) {
        String json = "";
        ObjectMapper mapper = new ObjectMapper();

        try {
            json = mapper.writeValueAsString(map);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

}