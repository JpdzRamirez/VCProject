package com.cmc.evaluacion.fase2.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(TestArchivoCorrupto.class);
		suite.addTestSuite(TestCalcularBalances.class);
		suite.addTestSuite(TestCartera.class);
		suite.addTestSuite(TestClientes.class);
		suite.addTestSuite(TestClientesDuplicados.class);
		suite.addTestSuite(TestColocarPrestamos.class);
		suite.addTestSuite(TestConstantes.class);
		suite.addTestSuite(TestConvertirFecha.class);
		suite.addTestSuite(TestPagos.class);
		//$JUnit-END$
		return suite;
	}

}
