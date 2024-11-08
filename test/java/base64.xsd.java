// Code generated by xgen. DO NOT EDIT.

package schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

// MyType1 ...
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "myType1")
public class MyType1 {
	protected List<Byte> MyType1;
}

// MyType2 ...
public class MyType2 {
	@XmlAttribute(name = "length")
	protected Integer LengthAttr;
	@XmlValue
	protected List<Byte> value;
}

// MyType3 ...
public class MyType3 {
	@XmlAttribute(name = "length")
	protected Integer LengthAttr;
	@XmlValue
	protected String value;
}

// MyType4 ...
public class MyType4 {
	@XmlElement(required = true, name = "title")
	protected String Title;
	@XmlElement(required = true, name = "blob")
	protected List<Byte> Blob;
	@XmlElement(required = true, name = "timestamp")
	protected String Timestamp;
}

// MyType5 ...
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAttribute(required = true, name = "myType5")
public class MyType5 {
	protected String MyType5;
}

// MyType6 ...
public class MyType6 {
	@XmlAttribute(name = "code")
	protected String CodeAttr;
	@XmlAttribute(name = "identifier")
	protected Integer IdentifierAttr;
}

// MyType7 ...
public class MyType7 {
	@XmlAttribute(name = "origin", required = true)
	protected String OriginAttr;
	@XmlValue
	protected String value;
}

// MyType8 ...
public class MyType8 {
	@XmlElement(required = true, name = "title")
	protected List<MyType4> Title;
}

// MyType9 ...
public class MyType9 {
	@XmlElement(required = true, name = "title")
	protected List<MyType4> Title;
}

// MyType10 ...
public class MyType10 {
	@XmlElement(required = true, name = "title")
	protected MyType4 Title;
}

// TopLevel ...
public class TopLevel extends MyType6  {
	@XmlAttribute(name = "cost")
	protected Float CostAttr;
	@XmlAttribute(name = "LastUpdated")
	protected String LastUpdatedAttr;
	@XmlElement(required = true, name = "nested")
	protected MyType7 Nested;
	@XmlElement(required = true, name = "myType1")
	protected List<List<Byte>> MyType1;
	@XmlElement(required = true, name = "myType2")
	protected List<MyType2> MyType2;
}
