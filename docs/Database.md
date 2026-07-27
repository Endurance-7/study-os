# StudyOS Database Design

## Main Tables

- Users
- Roles
- Notes
- Subjects
- Topics
- PDFs
- Flashcards
- Quiz
- Questions
- Answers
- Study Plans
- Progress
- Notifications

---

## Relationships

One User

↓

Many Notes

↓

Many Flashcards

↓

Many Quiz Attempts

---

## Database

PostgreSQL

---

## Future Improvements

- Audit Tables
- Soft Delete
- Version History