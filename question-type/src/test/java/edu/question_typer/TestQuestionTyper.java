package edu.question_typer;

import edu.illinois.cs.cogcomp.annotation.AnnotatorException;
import edu.illinois.cs.cogcomp.core.datastructures.ViewNames;
import edu.illinois.cs.cogcomp.core.datastructures.textannotation.TextAnnotation;
import edu.illinois.cs.cogcomp.core.utilities.DummyTextAnnotationGenerator;
import edu.illinois.cs.cogcomp.question_typer.QuestionTypeAnnotator;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

/**
 * Created by daniel on 1/24/18.
 */
public class TestQuestionTyper {

    @Ignore
    @Test
    public void testAnnotator() throws IOException, AnnotatorException {
        QuestionTypeAnnotator annotator = new QuestionTypeAnnotator();
        TextAnnotation ta = DummyTextAnnotationGenerator.generateAnnotatedTextAnnotation(false, 1);
        annotator.getView(ta);
        assertTrue(ta.hasView(ViewNames.QUESTION_TYPE));
    }
}
