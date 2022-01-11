package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import org.buildingsmart_tech.mvd.xml._1.MvdXML;

public class MvdImporter {
	
	public MvdXML read(File file) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance("org.buildingsmart_tech.mvd.xml._1");

			Unmarshaller unmarshaller = context.createUnmarshaller();
			//unmarshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			//unmarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.buildingsmart-tech.org/mvd/XML/1.1 http://www.buildingsmart-tech.org/mvd/XML/1.1/mvdXML_V1.1_add1.xsd");

			Object obj = unmarshaller.unmarshal(file);
			if(obj instanceof JAXBElement<?>) {
				Object mvdxml = ((JAXBElement<?>)obj).getValue();
				if(mvdxml instanceof MvdXML) {
					return (MvdXML)mvdxml;
				}
			}

		} catch (JAXBException e2) {
			e2.printStackTrace();
		}
		return null;
	}

}
