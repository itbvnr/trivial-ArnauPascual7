package cat.itb.m78.exercices

data class Question(val statement: String, val answers: List<Answer>)
data class Answer(val answer: String, val correct: Boolean)

val questions: List<Question> = listOf(
    Question(
        "Question 1",
        listOf(
            Answer("Answer 1", true),
            Answer("Answer 2", false),
            Answer("Answer 2", false),
            Answer("Answer 2", false)
        )
    ),
    Question(
        "Question 2",
        listOf(
            Answer("Answer 1", true),
            Answer("Answer 2", false),
            Answer("Answer 2", false),
            Answer("Answer 2", false)
        )
    ),
    Question(
        "Question 3",
        listOf(
            Answer("Answer 1", true),
            Answer("Answer 2", false),
            Answer("Answer 2", false),
            Answer("Answer 2", false)
        )
    )
)