public class Book extends TangibleAsset{
	private String isbn;

	public BooK(STring isbn){
		super(name,price,color);
		this.isbn = isbn;
	}

	public String getName(){
		return this.isbn;
	}
}
