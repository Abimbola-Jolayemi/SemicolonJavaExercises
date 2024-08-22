def set_no_of_students():
    while True:
        try:
            no_of_students = int(input("Enter number of Students: "))
            if no_of_students <= 0:
                print("Invalid input! Enter a positive number.")
            else:
                return no_of_students
        except ValueError:
            print("Invalid input. Please enter an integer.")

def set_no_of_subjects():
    while True:
        try:
            no_of_subjects = int(input("Enter number of Subjects: "))
            if no_of_subjects <= 0:
                print("Invalid input! Enter a positive number.")
            else:
                return no_of_subjects
        except ValueError:
            print("Invalid input. Please enter an integer.")

def collect_scores(no_of_students, no_of_subjects):
    scores = []
    for student in range(no_of_students):
        student_scores = []
        print(f"STUDENT {student + 1}:")
        for subject in range(no_of_subjects):
            while True:
                try:
                    score = int(input(f"Subject {subject + 1}: "))
                    if 0 <= score <= 100:
                        student_scores.append(score)
                        break
                    else:
                        print("Invalid Score! Enter a score between 0 and 100.")
                except ValueError:
                    print("Invalid input. Please enter an integer.")
        scores.append(student_scores)
    return scores

def compute_total_per_student(scores):
    return [sum(student_scores) for student_scores in scores]

def compute_average_per_student(total_per_student, no_of_subjects):
    return [total / no_of_subjects for total in total_per_student]

def compute_positions(total_per_student):
    indices = list(range(len(total_per_student)))
    indices.sort(key=lambda x: total_per_student[x], reverse=True)

    positions = [0] * len(total_per_student)
    current_position = 1
    previous_total = -1
    for index in indices:
        if total_per_student[index] == previous_total:
            positions[index] = current_position
        else:
            current_position = index + 1
            positions[index] = current_position
            previous_total = total_per_student[index]
    return positions

def display_results(scores, total_per_student, average_scores, positions):
    print("\nResults:")
    
    header = ["Student"] + [f"Subject{subject + 1}" for subject in range(len(scores[0]))] + ["Total", "Average", "Position"]
    print("{:<10}".format(header[0]), end='')
    for item in header[1:]:
        print("{:<10}".format(item), end='')
    print()
    
    for student, student_scores in enumerate(scores):
        print(f"Student{student + 1:<10}", end='')
        for score in student_scores:
            print("{:<10}".format(score), end='')
        print("{:<10}".format(total_per_student[student]), end='')
        print("{:<10.2f}".format(average_scores[student]), end='')
        print("{:<10}".format(positions[student]))


no_of_students = set_no_of_students()
no_of_subjects = set_no_of_subjects()
print(f"No of Students: {no_of_students}, No of Subjects: {no_of_subjects}")
scores = collect_scores(no_of_students, no_of_subjects)

total_per_student = compute_total_per_student(scores)
average_scores = compute_average_per_student(total_per_student, no_of_subjects)
positions = compute_positions(total_per_student)
print()
display_results(scores, total_per_student, average_scores, positions)