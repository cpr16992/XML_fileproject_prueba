package allen;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Tags {


	public static void main(String[] args) {
		try {
			final JAXBContext jc = JAXBContext.newInstance("allen");
			final Unmarshaller u = jc.createUnmarshaller();


			final Response.Structure rootElem = extracted(u);
			System.out.println(rootElem.getName());
			System.out.println(rootElem.getChildren().getChild());

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static Response.Structure extracted(final Unmarshaller u) throws Exception
	{
		InputStream is = new FileInputStream("C:/Documents and Settings/invitado/git/XML_fileproject/.project/JAXBAllen/src/ref.xml");
		//InputStream is = new FileInputStream("C:\\Documents and Settings\\invitado\\git\\XML_fileproject\\.project\\JAXBP\\src\\org\\example\\schemabook\\Book.xml");
		Response elm = (Response)u.unmarshal(is);
		return elm.getStructure();
	}
}