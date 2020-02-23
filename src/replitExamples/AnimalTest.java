package replitExamples;

import javax.xml.namespace.QName;

public class AnimalTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog2", 6, "kadin");
        Dog dog2 = new Dog("Dog1", 5, "erkek");
        System.out.println(dog2.equals(dog1));

        System.out.println("%s:%s"+ dog1.getName());
    }
}
