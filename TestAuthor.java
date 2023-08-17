public class TestAuthor {
    //GABRIEL KENJI UTIYAMA CB3012069
    public static void main(String[] args){
        Author author = new Author("Gabriel Kenji", "gabrielkenji2000@hotmail.com", 'm');
        System.out.println(author.toString());
        author.setEmail("gabrielkenji2000@hotmail.com.br");
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
    }
}
