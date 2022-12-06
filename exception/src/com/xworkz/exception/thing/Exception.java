package com.xworkz.exception.thing;

import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.geom.IllegalPathStateException;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.lang.reflect.UndeclaredThrowableException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;

import javax.activation.MimeTypeParseException;
import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMRuntimeException;
import javax.management.RuntimeOperationsException;
import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.naming.NamingException;
import javax.print.attribute.UnmodifiableSetException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.TypeConstraintException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.ws.WebServiceException;

import org.ietf.jgss.GSSException;
import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Exception {

	public void method() {
		System.out.println("running exception....");
		throw new JMRuntimeException();
	}

	public void runtimeMethod() {
		System.out.println("running runtime....");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void runtimeMethod1() {
		System.out.println("running runtime method....");
		throw new ArithmeticException();
	}

	public void runtimeMethod2() {
		System.out.println("running runtime method....");
		throw new ArithmeticException();
	}

	public void runtimeMethod3() {
		System.out.println("running runtime method....");
		throw new ArrayStoreException();
	}

	public void runtimeMethod4() {
		System.out.println("running rutime method....");
		throw new BufferOverflowException();
	}

	public void runtimeMethod5() {
		System.out.println("running runtimr method....");
		throw new BufferUnderflowException();
	}

	public void runtimeMethod6() {
		System.out.println("running runtime method....");
		throw new CannotRedoException();
	}

	public void runtimeMethod7() {
		System.out.println("running runtime method....");
		throw new CannotUndoException();
	}

	public void runtimeMethod8() {
		System.out.println("running runtime method....");
		throw new ClassCastException();
	}

	public void runtimeMethod9() {
		System.out.println("running runtime method....");
		throw new CMMException(null);
	}

	public void runtimeMethod10() {
		System.out.println("running runtime method....");
		throw new ConcurrentModificationException();
	}

	public void runtimeMethod11() {
		System.out.println("running runtime method....");
		throw new DataBindingException(null);
	}

	public void runtimeMethod12() {
		System.out.println("running runtime method....");
		throw new WrongMethodTypeException();
	}

	public void runtimeMethod13() {
		System.out.println("running runtime method....");
		throw new EmptyStackException();
	}

	public void runtimeMethod14() {
		System.out.println("running runtime method....");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void runtimeMethod15() {
		System.out.println("running runtime method....");
		throw new EventException((short) 5, null);
	}

	public void runtimeMethod16() {
		System.out.println("running runtime method....");
		throw new FileSystemAlreadyExistsException();
	}

	public void runtimeMethod17() {
		System.out.println("running runtime method....");
		throw new FileSystemNotFoundException();
	}

	public void runtimeMethod18() {
		System.out.println("running runtime method....");
		throw new IllegalArgumentException();
	}

	public void runtimeMethod19() {
		System.out.println("running runtime method....");
		throw new IllegalMonitorStateException();
	}

	public void runtimeMethod20() {
		System.out.println("running runtime method....");
		throw new IllegalPathStateException();
	}

	public void runtimeMethod21() {
		System.out.println("running runtime method....");
		throw new IllegalStateException();
	}

	public void runtimeMethod22() {
		System.out.println("running runtime method....");
		throw new ImagingOpException(null);
	}

	public void runtimeMethod23() {
		System.out.println("running runtime method....");
		throw new IncompleteAnnotationException(null, null);
	}

	public void runtimeMethod24() {
		System.out.println("running runtime method....");
		throw new IndexOutOfBoundsException();
	}

	public void runtimeMethod25() {
		System.out.println("running runtime method....");
		throw new LSException((short) 0, null);
	}

	public void runtimeMethod26() {
		System.out.println("running runtime method....");
		throw new MalformedParameterizedTypeException();
	}

	public void runtimeMethod27() {
		System.out.println("running runtime method....");
		throw new MirroredTypesException(null);
	}

	public void runtimeMethod28() {
		System.out.println("running runtime method....");
		throw new MissingResourceException(null, null, null);
	}

	public void runtimeMethod29() {
		System.out.println("running runtime method....");
		throw new NegativeArraySizeException();
	}

	public void runtimeMethod30() {
		System.out.println("running runtimr method....");
		throw new NoSuchElementException();
	}

	public void runtimeMethod31() {
		System.out.println("running runtime method....");
		throw new NoSuchMechanismException();
	}

	public void runtimeMethod32() {
		System.out.println("running runtime method....");
		throw new NullPointerException();
	}

	public void runtimeMethod33() {
		System.out.println("running runtime method....");
		throw new ProfileDataException(null);
	}

	public void runtimeMethod34() {
		System.out.println("running runtime method....");
		throw new ProviderException();
	}

	public void runtimeMethod35() {
		System.out.println("running runtime method....");
		throw new ProviderNotFoundException();
	}

	public void method1() throws TimeoutException {
		System.out.println("running timeout exception");
		throw new TimeoutException();
	}

	public void method2() throws AclNotFoundException {
		System.out.println("running method.....");
		throw new AclNotFoundException();
	}

	public void method3() throws ActivationException {
		System.out.println("running method....");
		throw new ActivationException();
	}

	public void method4() {
		System.out.println("running method....");
		throw new AlreadyBoundException();
	}

	public void method5() throws ApplicationException {
		System.out.println("running method....");
		throw new ApplicationException(null, null);
	}

	public void method6() throws AWTException {
		System.out.println("running method....");
		throw new AWTException(null);
	}

	public void method7() throws BadAttributeValueExpException {
		System.out.println("running method....");
		throw new BadAttributeValueExpException(getClass());
	}

	public void method8() throws BadBinaryOpValueExpException {
		System.out.println("running method....");
		throw new BadBinaryOpValueExpException(null);
	}

	public void method9() throws BadLocationException {
		System.out.println("running methoid....");
		throw new BadLocationException(null, 0);
	}

	public void method10() throws BadStringOperationException {
		System.out.println("running methoid....");
		throw new BadStringOperationException(null);
	}

	public void method11() throws BrokenBarrierException {
		System.out.println("running methoid....");
		throw new BrokenBarrierException();
	}

	public void method12() throws CertificateException {
		System.out.println("running methoid....");
		throw new CertificateException();
	}

	public void method13() throws CloneNotSupportedException {
		System.out.println("running methoid....");
		throw new CloneNotSupportedException();
	}

	public void method14() throws DataFormatException {
		System.out.println("running methoid....");
		throw new DataFormatException();
	}

	public void method15() throws DatatypeConfigurationException {
		System.out.println("running methoid....");
		throw new DatatypeConfigurationException();
	}

	public void method16() throws DestroyFailedException {
		System.out.println("running methoid....");
		throw new DestroyFailedException();
	}

	public void method17() throws ExecutionException {
		System.out.println("running methoid....");
		throw new ExecutionException(null);
	}

	public void method18() throws ExpandVetoException {
		System.out.println("running methoid....");
		throw new ExpandVetoException(null);
	}

	public void method19() throws FontFormatException {
		System.out.println("running methoid....");
		throw new FontFormatException(null);
	}

	public void method20() throws GeneralSecurityException {
		System.out.println("running methoid....");
		throw new GeneralSecurityException();
	}

	public void method21() throws GSSException {
		System.out.println("running methoid....");
		throw new GSSException(0);
	}

	public void method22() throws IllegalClassFormatException {
		System.out.println("running methoid....");
		throw new IllegalClassFormatException();
	}

	public void method23() throws InterruptedException {
		System.out.println("running methoid....");
		throw new InterruptedException();
	}

	public void method24() throws IntrospectionException {
		System.out.println("running methoid....");
		throw new IntrospectionException();
	}

	public void method25() throws InvalidApplicationException {
		System.out.println("running methoid....");
		throw new InvalidApplicationException(null);
	}

	public void method26() throws InvalidMidiDataException {
		System.out.println("running methoid....");
		throw new InvalidMidiDataException();
	}

	public void method27() throws InvalidTargetObjectTypeException {
		System.out.println("running methoid....");
		throw new InvalidTargetObjectTypeException();
	}

	public void method28() throws IOException {
		System.out.println("running methoid....");
		throw new IOException();
	}

	public void method29() throws LastOwnerException {
		System.out.println("running methoid....");
		throw new LastOwnerException();
	}

	public void method30() throws LineUnavailableException {
		System.out.println("running methoid....");
		throw new LineUnavailableException();
	}

	public void method31() throws MarshalException {
		System.out.println("running methoid....");
		throw new MarshalException();
	}

	public void method32() throws MidiUnavailableException {
		System.out.println("running methoid....");
		throw new MidiUnavailableException();
	}

	public void method33() throws MimeTypeParseException {
		System.out.println("running methoid....");
		throw new MimeTypeParseException();
	}

	public void method34() throws NamingException {
		System.out.println("running methoid....");
		throw new NamingException();
	}

	public void method35() throws NoninvertibleTransformException {
		System.out.println("running methoid....");
		throw new NoninvertibleTransformException(null);
	}

	public void methodError1() {
		System.out.println("running error methoid....");
		throw new AssertionError();
	}

	public void methodError2(String String) {
		System.out.println("running error methoid....");
		throw new CoderMalfunctionError(null);
	}

	public void methodError3() {
		System.out.println("running error methoid....");
		throw new FactoryConfigurationError();
	}

	public void methodError4() {
		System.out.println("running error methoid....");
		throw new IOError(null);
	}

	public void methodError5() {
		System.out.println("running error methoid....");
		throw new LinkageError();
	}

	public void methodError6() {
		System.out.println("running error methoid....");
		throw new ServiceConfigurationError(null);
	}

	public void methodError7() {
		System.out.println("running error methoid....");
		throw new ThreadDeath();
	}

	public void methodError8() throws TransformerConfigurationException {
		System.out.println("running error methoid....");
		throw new TransformerConfigurationException();
	}

	public void methodError9() {
		System.out.println("running error methoid....");
		throw new InternalError();
	}

	public void methodError10() {
		System.out.println("running error methoid....");
		throw new OutOfMemoryError();
	}

	public void methodError11() {
		System.out.println("running error methoid....");
		throw new StackOverflowError();
	}

	public void methodError12() {
		System.out.println("running error methoid....");
		throw new UnknownError();
	}

	public void methodError13() {
		System.out.println("running error methoid....");
		throw new BootstrapMethodError();
	}

	public void methodError14() {
		System.out.println("running error methoid....");
		throw new ClassCircularityError();
	}

	public void methodError15() {
		System.out.println("running error methoid....");
		throw new InternalError();
	}

	public void methodError16() {
		System.out.println("running error methoid....");
		throw new AnnotationFormatError(null, null);
	}

	public void methodError17() {
		System.out.println("running error methoid....");
		throw new LinkageError();
	}

	public void methodError18() {
		System.out.println("running error methoid....");
		throw new RasterFormatException(null);
	}

	public void methodError19() {
		System.out.println("running error methoid....");
		throw new RejectedExecutionException();
	}

	public void methodError20() {
		System.out.println("running error methoid....");
		throw new SecurityException();
	}

	public void methodError21() {
		System.out.println("running error methoid....");
		throw new TypeNotPresentException(null, null);
	}

	public void methodError22() {
		System.out.println("running error methoid....");
		throw new RasterFormatException(null);
	}

	public void methodError23() {
		System.out.println("running error methoid....");
		throw new UndeclaredThrowableException(null);
	}

	public void methodError24() {
		System.out.println("running error methoid....");
		throw new UnmodifiableSetException();
	}

	public void methodError25() {
		System.out.println("running error methoid....");
		throw new UnsupportedOperationException();
	}

	public void methodError26() {
		System.out.println("running error methoid....");
		throw new WebServiceException();
	}

	public void methodError27() {
		System.out.println("running error methoid....");
		throw new WrongMethodTypeException();
	}

	public void methodError28() {
		System.out.println("running error methoid....");
		throw new RuntimeOperationsException(null);
	}

}
