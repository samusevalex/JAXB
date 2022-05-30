import javax.xml.bind.annotation.*;

@XmlRootElement
class Student {

    @XmlElement
    String name;

    @XmlElement
    int telephone;
}
