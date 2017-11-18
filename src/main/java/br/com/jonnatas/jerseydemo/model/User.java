package br.com.jonnatas.jerseydemo.model;

import javax.xml.bind.annotation.*;

import java.io.Serializable;

/**
 * Created by root on 16/07/17.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "user")
public class User implements Serializable {

    @XmlAttribute(name = "id")
    private int id;

    @XmlAttribute(name = "uri")
    private String uri;

    @XmlElement(name = "firstName")
    private String firstName;

    @XmlElement(name = "lastName")
    private String lastName;

    public int getId() {
        return id;
    }
    public String getUri() {
        return uri;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
