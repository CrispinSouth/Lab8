
public class EnumTest {
	public void testColorValues () throws AssertException
	{
	Color col = null;
	// RED:
	col = Color.RED ;
	Assert.assertEquals ("Incorrect rgb value in color" + col.name() , 255 , col.getR());
	Assert.assertEquals ("Incorrect rgb value in color" + col.name() ,  0, col.getG());
	Assert . assertEquals ( ” I n c o r r e c t rgb v al u e i n c o l o r ” + col . name ( ) , 0 , col . getB←-
	( ) ) ;
	// BLUE:
	col = Color . GREEN ;
	Assert . assertEquals ( ” I n c o r r e c t rgb v al u e i n c o l o r ” + col . name ( ) , 0 , col . getR←-
	( ) ) ;
	Assert . assertEquals ( ” I n c o r r e c t rgb v al u e i n c o l o r ” + col . name ( ) , 2 5 5 , col .←-
	getG ( ) ) ;
	Assert . assertEquals ( ” I n c o r r e c t rgb v al u e i n c o l o r ” + col . name ( ) , 0 , col . getB←-
	( ) ) ;

}
