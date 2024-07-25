package Writer;

import java.io.Serializable;

// СЕРИАЛИЗАЦИЯ

public interface Writer {
    void save(Serializable serializable); // сохранение
    Object read(); // загрузка
    void setPath(String path); // изменение пути
}
