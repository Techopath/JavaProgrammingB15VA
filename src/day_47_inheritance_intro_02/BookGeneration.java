package day_47_inheritance_intro_02;

public class BookGeneration {

    public static void main(String[] args) {
        Book science = new Book();
        science.getTitle();
        science.setTitle("Learn your importance in the Universe");

        Book book = new Book();
        book.setAuthor("Jamie chan");
        book.setTitle("Learn Java inOne Day");
        book.setPrice(11.67);
        book.setType("coding");

        System.out.println("-----book info --------");
        System.out.println("Author = "+book.getAuthor());
        System.out.println("Title = "+book.getTitle());
        System.out.println("Type = "+book.getType());
        System.out.println("Price = "+book.getPrice());


        AudioBook audioBook = new AudioBook();
        audioBook.setAuthor("Raul Gabriel");
        audioBook.setTitle("Java 8 in action");
        audioBook.setType("programming");
        audioBook.setPrice(14.95);
        audioBook.setAudioLength(12.05);
        audioBook.setNarrator("Selim");

        System.out.println("----book information------");
        System.out.println("Author = "+audioBook.getAuthor());
        System.out.println("Title = "+audioBook.getTitle());
        System.out.println("Type = "+audioBook.getType());
        System.out.println("Price = "+audioBook.getPrice());
        System.out.println("Audio Length is "+audioBook.getAudioLength()+" hours and narrated by "+audioBook.getNarrator());
        audioBook.listen();


    }


}
