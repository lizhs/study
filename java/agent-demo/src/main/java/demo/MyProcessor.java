package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;

public class MyProcessor implements Processor {

	@Override
	public Set<String> getSupportedOptions() {
		System.out.println("==========getSupportedOptions");
		//throw new RuntimeException();
 		return new HashSet<>();
	}

	@Override
	public Set<String> getSupportedAnnotationTypes() {
		System.out.println("==========getSupportedAnnotationTypes");
		//throw new RuntimeException();
		return new HashSet<>();
	}

	@Override
	public SourceVersion getSupportedSourceVersion() {
		System.out.println("==========getSupportedSourceVersion");
		//throw new RuntimeException();

		return SourceVersion.RELEASE_8;
	}

	@Override
	public void init(ProcessingEnvironment processingEnv) {
		System.out.println("==========init");
		//throw new RuntimeException();

	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		System.out.println("==========process");
		//throw new RuntimeException();

		return false;
	}

	@Override
	public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotation,
			ExecutableElement member, String userText) {
		System.out.println("==========getCompletions");
		//throw new RuntimeException();

		return (Iterable<? extends Completion>) new HashSet().iterator();
	}

}
