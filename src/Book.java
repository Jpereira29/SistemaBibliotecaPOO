public class Book implements ILibraryArtifact {
    private String title;
    private Author author;
    private int publicationYear;
    private int available;
    private String genre;

    public Book(String title, Author author, int publicationYear, int available, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.available = available;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailableForLoan() {
        return available > 0;
    }
}
