# TCS Practise Questions

A curated collection of practice problems, solutions, and resources to help prepare for TCS-style placement and coding interview rounds.

## Repository structure

- `problems/` — Problem statements grouped by topic or company-round.
- `solutions/` — Reference solutions organized by language: `solutions/python/`, `solutions/cpp/`, `solutions/java/`, etc.
- `resources/` — Notes, cheat-sheets, and links to helpful articles or tutorials.
- `scripts/` — Utility scripts (tests, input generators, runners).
- `README.md` — This file.

## How to use

1. Clone the repository:

   ```bash
   git clone https://github.com/Chandrasish-Bhattacharya/TCS-Practise-Questions.git
   cd TCS-Practise-Questions
   ```

2. Browse `problems/` to find problem statements.
3. Open `solutions/<language>/` to see example implementations.
4. Run solutions locally. Examples:

   - Python:
     ```bash
     python3 solutions/python/<solution_file>.py < input.txt
     ```
   - C++:
     ```bash
     g++ -std=c++17 -O2 solutions/cpp/<solution_file>.cpp -o solution && ./solution < input.txt
     ```
   - Java:
     ```bash
     javac solutions/java/<SolutionFile>.java && java -cp solutions/java Solution < input.txt
     ```

## Contributing

Contributions are welcome — add problems, testcases, or improved solutions.

- Create a new branch for your change: `git checkout -b add/<short-description>`
- Put problem statements in `problems/<topic>/` and solutions in `solutions/<language>/`.
- Each solution should include:
  - Problem name and source as a header comment
  - Expected input/output format
  - Short explanation or approach (in comments or a companion `.md` file)
- Open a Pull Request with a clear title and description.

## Coding & file naming conventions

- Use lowercase filenames with hyphens or underscores, e.g. `two-sum.cpp` or `binary_search.py`.
- Include the problem ID or short name in the filename.
- Add comments that explain the approach and complexity (time & space).

## License

This repository is licensed under the MIT License. See `LICENSE` for details.

## Contact

If you have questions or suggestions, open an issue or contact me at https://github.com/Chandrasish-Bhattacharya
