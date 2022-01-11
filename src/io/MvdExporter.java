package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import org.buildingsmart_tech.mvd.xml._1.MvdXML;

public class MvdExporter {
	
	public void saveToFile(String path, MvdXML mvdXML) {
		saveToFile(new File(path), mvdXML);
	}
		

	public void saveToFile(File file, MvdXML mvdXML) {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance("org.buildingsmart_tech.mvd.xml._1");

			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.buildingsmart-tech.org/mvd/XML/1.1 http://www.buildingsmart-tech.org/mvd/XML/1.1/mvdXML_V1.1_add1.xsd");


			OutputStream outputStream = new FileOutputStream(file);

			QName qName = new QName("http://buildingsmart-tech.org/mvd/XML/1.1","mvdXML"); 
			JAXBElement<MvdXML> root = new JAXBElement<>(qName, MvdXML.class, mvdXML);
			marshaller.marshal(root, outputStream);
			
			outputStream.close();

		} catch (JAXBException | IOException e2) {
			e2.printStackTrace();
		}
	}

}
