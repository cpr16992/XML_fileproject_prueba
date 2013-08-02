package allen;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Tags {


	public static void main(String[] args) {    
		try {
			final JAXBContext jc = JAXBContext.newInstance(Etiqueta.class.getPackage().getName());
			final Unmarshaller u = jc.createUnmarshaller();
			final JAXBElement<Etiqueta> menuElement = extracted(u);
			System.out.println("Nombre: " + menuElement.getValue().getName());
			System.out.println("ISBN: " + menuElement.getValue().getID());
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}

	@SuppressWarnings("unchecked")
	private static JAXBElement<Etiqueta> extracted(final Unmarshaller u) throws JAXBException
	{

		JAXBElement<Etiqueta> elm = (JAXBElement<Etiqueta>)u.unmarshal(Tags.class.getResourceAsStream("ref.xml"));
		return elm;
	}
}
