//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2013.08.08 a las 04:24:57 PM CEST 
//


package allen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para structure complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="structure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="atlas-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="ontology-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="acronym" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="color-hex-triplet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graph-order" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="st-level" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hemisphere-id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="parent-structure-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="children" type="{}children" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "structure", propOrder = {
    "id",
    "atlasId",
    "ontologyId",
    "acronym",
    "name",
    "colorHexTriplet",
    "graphOrder",
    "stLevel",
    "hemisphereId",
    "parentStructureId",
    "children"
})
public class Structure {

    protected short id;
    @XmlElement(name = "atlas-id")
    protected byte atlasId;
    @XmlElement(name = "ontology-id")
    protected byte ontologyId;
    @XmlElement(required = true)
    protected String acronym;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "color-hex-triplet", required = true)
    protected String colorHexTriplet;
    @XmlElement(name = "graph-order")
    protected byte graphOrder;
    @XmlElement(name = "st-level", required = true)
    protected String stLevel;
    @XmlElement(name = "hemisphere-id")
    protected byte hemisphereId;
    @XmlElement(name = "parent-structure-id", required = true)
    protected String parentStructureId;
    protected Children children;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public short getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(short value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad atlasId.
     * 
     */
    public byte getAtlasId() {
        return atlasId;
    }

    /**
     * Define el valor de la propiedad atlasId.
     * 
     */
    public void setAtlasId(byte value) {
        this.atlasId = value;
    }

    /**
     * Obtiene el valor de la propiedad ontologyId.
     * 
     */
    public byte getOntologyId() {
        return ontologyId;
    }

    /**
     * Define el valor de la propiedad ontologyId.
     * 
     */
    public void setOntologyId(byte value) {
        this.ontologyId = value;
    }

    /**
     * Obtiene el valor de la propiedad acronym.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronym() {
        return acronym;
    }

    /**
     * Define el valor de la propiedad acronym.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronym(String value) {
        this.acronym = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad colorHexTriplet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorHexTriplet() {
        return colorHexTriplet;
    }

    /**
     * Define el valor de la propiedad colorHexTriplet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorHexTriplet(String value) {
        this.colorHexTriplet = value;
    }

    /**
     * Obtiene el valor de la propiedad graphOrder.
     * 
     */
    public byte getGraphOrder() {
        return graphOrder;
    }

    /**
     * Define el valor de la propiedad graphOrder.
     * 
     */
    public void setGraphOrder(byte value) {
        this.graphOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad stLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStLevel() {
        return stLevel;
    }

    /**
     * Define el valor de la propiedad stLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStLevel(String value) {
        this.stLevel = value;
    }

    /**
     * Obtiene el valor de la propiedad hemisphereId.
     * 
     */
    public byte getHemisphereId() {
        return hemisphereId;
    }

    /**
     * Define el valor de la propiedad hemisphereId.
     * 
     */
    public void setHemisphereId(byte value) {
        this.hemisphereId = value;
    }

    /**
     * Obtiene el valor de la propiedad parentStructureId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStructureId() {
        return parentStructureId;
    }

    /**
     * Define el valor de la propiedad parentStructureId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStructureId(String value) {
        this.parentStructureId = value;
    }

    /**
     * Obtiene el valor de la propiedad children.
     * 
     * @return
     *     possible object is
     *     {@link Children }
     *     
     */
    public Children getChildren() {
        return children;
    }

    /**
     * Define el valor de la propiedad children.
     * 
     * @param value
     *     allowed object is
     *     {@link Children }
     *     
     */
    public void setChildren(Structure value) {
        this.children.addChild(value);
    }

}
