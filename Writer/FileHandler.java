package Writer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

// СЕРИАЛИЗАЦИЯ

public class FileHandler implements Writer {

    private String filePath = "C:\\Users\\Admin\\Desktop\\FamilyTree\\Writer\\writer.txt";

    @Override
    public void save(Serializable serializable) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(serializable);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public Object read() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Object object = objectInputStream.readObject();
            return object;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void setPath(String path) {
        this.filePath = path;
    }
    
}
