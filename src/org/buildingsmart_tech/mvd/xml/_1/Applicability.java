//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.01.07 um 10:54:58 AM CET 
//


package org.buildingsmart_tech.mvd.xml._1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für applicability.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="applicability">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="export"/>
 *     &lt;enumeration value="import"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "applicability")
@XmlEnum
public enum Applicability {

    @XmlEnumValue("export")
    EXPORT("export"),
    @XmlEnumValue("import")
    IMPORT("import"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    Applicability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Applicability fromValue(String v) {
        for (Applicability c: Applicability.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
