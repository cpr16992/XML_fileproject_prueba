package org.example.schemabook;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.example.schemabook.Libro;
public class Book {
    public static void main(String[] args) {    
        try {
            final JAXBContext jc = JAXBContext.newInstance(Libro.class.getPackage().getName());
            final Unmarshaller u = jc.createUnmarshaller();
            final JAXBElement<Libro> menuElement = extracted(u);
            System.out.println("Nombre: " + menuElement.getValue().getNombre());
            System.out.println("ISBN: " + menuElement.getValue().getISBN());
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    }

	@SuppressWarnings("unchecked")
	private static JAXBElement<Libro> extracted(final Unmarshaller u) throws JAXBException
			 {
		
		JAXBElement<Libro> elm = (JAXBElement<Libro>)u.unmarshal(Book.class.getResourceAsStream("/Book.xml"));
		return elm;
	}
}