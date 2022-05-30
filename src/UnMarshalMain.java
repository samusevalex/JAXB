import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UnMarshalMain {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Student.class);
            Unmarshaller m = jc.createUnmarshaller();
            Student st = (Student) m.unmarshal(new FileInputStream("student.xml"));
            System.out.println(st.name);
        } catch (JAXBException | FileNotFoundException e) {
        }
    }
}