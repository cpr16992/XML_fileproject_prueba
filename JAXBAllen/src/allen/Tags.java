package allen;

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

	private static Response.Structure extracted(final Unmarshaller u) throws JAXBException
	{
		 Response elm = (Response)u.unmarshal(Tags.class.getResourceAsStream("ref.xml"));
			return elm.getStructure();
	}
}
