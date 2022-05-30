import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalMain {
    public static void main(String[ ] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Student.class);
            Marshaller m = jc.createMarshaller();
            Student st = new Student();
            st.name = "Vasya";
            st.telephone = 926131;
            m.marshal(st,new FileOutputStream("student.xml"));
        } catch (JAXBException | FileNotFoundException e) {}
    }
}