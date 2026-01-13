# TCS Practice Questions

[![License](https://img.shields.io/badge/license-MIT-yellow.svg)](https://github.com/Chandrasish-Bhattacharya/TCS-Practise-Questions/blob/main/LICENSE)  
[![Top language](https://img.shields.io/github/languages/top/Chandrasish-Bhattacharya/TCS-Practise-Questions)](https://github.com/Chandrasish-Bhattacharya/TCS-Practise-Questions)  
[![Language: Java](https://img.shields.io/badge/language-Java-007396?logo=java&logoColor=white)](https://www.java.com/)

A concise collection of TCS-style practice problems and reference solutions.

Table of Contents
- [Repository structure](#repository-structure)
- [How to use](#how-to-use)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Repository structure
- `problems/` — Problem statements in plain text or markdown.
- `solutions/` — Reference solutions organized by language (e.g. `solutions/java/`).
- `resources/` — Notes, links, and supplementary materials.

## How to use
1. Clone:
   ```bash
   git clone https://github.com/Chandrasish-Bhattacharya/TCS-Practise-Questions.git
   cd TCS-Practise-Questions
   ```
2. Browse problems in `problems/` and solution code in `solutions/<language>/`.
3. Run Java solutions (example):
   - If the solution file defines a class named `Solution` in `solutions/java/Solution.java`:
     ```bash
     javac solutions/java/Solution.java
     java -cp solutions/java Solution < input.txt
     ```
   - If your solution is in a package, adjust the `-cp` and fully-qualified class name accordingly.
4. Example input
   - Provide sample input in a file (e.g. `input.txt`) and redirect it into the program as shown above.
5. Tests (optional)
   - If a solution includes a small test harness or sample input/output files, run them to verify behavior.

## Contributing
Thanks for wanting to contribute! Small, focused PRs are easiest to review.

Guidelines
- Fork the repository and create a feature branch named `add/<short-desc>` or `fix/<short-desc>`.
- Add a problem or a solution; for solutions include:
  - Problem statement or a link to the problem file.
  - Input/output format and constraints.
  - A short explanation of the approach and complexity.
- Add tests or sample input/output where possible.
- Commit messages should be concise and descriptive.

Suggested PR checklist
- [ ] Problem statement included or linked.
- [ ] Solution compiles and runs locally.
- [ ] Explanation and complexity provided.
- [ ] Files placed in the correct language directory under `solutions/`.
- [ ] No sensitive data included.

If you're adding many problems or a new language folder, open a draft PR first so maintainers can give early feedback.

## License
This repository uses the MIT License — see `LICENSE` for details.

## Contact
If you need help or want to suggest a change, open an issue or contact the maintainer via GitHub.
