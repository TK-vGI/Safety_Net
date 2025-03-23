package safetynet;

// Do not delete or change this file.
// Clone the repository inside the project root.
// Fulfill the objectives and press the `Check` button.

public class Main {
    public static void main(String[] args) {
        //
        /* stage 1
        // Clone the remote Git repository to your local machine at the project root
        git clone https://github.com/hyperskill-content/Safety-net-study-repository.git

        // Create a local copy from the remote repos:
        // git checkout -b local_branch_name origin/remote_branch_name
        git checkout -b 0.2.x-dev origin/0.2.x-dev
        git checkout -b feature/case origin/feature/case

        git switch 0.2.x-dev    // Switch to the development branch 0.2.x-dev
        git branch --all        // List all branches in local repository, to confirm that the correct branches are present

        end stage 1 */

        /* stage 2

        git switch 0.2.x-dev        // Switch to the development branch 0.2.x-dev
        git branch feature/math     // Create new branch feature/math
        git switch feature/math     // Switch to the new branch feature/math

        cd ./Safety-net-study-repository/
        echo -e 'def addition(a, b):\n' > math_operations.py    // Create file with content
        echo '    return a + b ' >> math_operations.py          // Create file with content

        git commit -m "feat: new function addition"             // Commit file with message

        end stage 2 */

        /* stage 3

        cd .\Safety-net-study-repository\	// Navigate to repository

        git switch main				// Switch to main branch
        git merge --ff-only feature/math	// merge feature/math branch to main branch
        git branch -d feature/math		// delete branch feature/math

        end stage 3 */

        /* stage 4

        git switch 0.2.x-dev    		// Switch to the development branch 0.2.x-dev
        git cherry-pick <last-commit>		// Pick commit with <hash> to branch 0.2.x-dev
        git switch main 	 	  	// Switch to main branch
        git reset --mixed <hash-initial state>	// Reset main branch to desired state (feat: Initial)

        end stage 4 */

        /* stage 5

        cd .\Safety-net-study-repository\			// Navigate to repository
        git checkout -b feature/case origin/feature/case	// git checkout -b local_branch_name origin/remote_branch_name
        git switch feature/case					// Switch to the branch feature/case
        git checkout 6b2ec72 -- case_operations.py		// Restore the file case_operations.py using the commit 6b2ec72
        // git restore 6b2ec72 -- case_operations.py		// ?Does this work as well?

        git add case_operations.py					// Add file to stage
        git commit -m "refactor: restored case operations from 6b2ec72"	// Commit change with message

        end stage 5 */

        /* stage 6

        cd .\Safety-net-study-repository\	// Navigate to repository

        git checkout feature/case		// Switch to branch feature/case
        git rebase 0.2.x-dev			// Rebase 0.2.x-dev to feature/case
        git switch 0.2.x-dev			// Switch to branch 0.2.x-dev
        git merge --ff-only feature/case	// merge feature/case branch to 0.2.x-dev branch
        git branch -d feature/case		// delete branch feature/case

        end stage 6*/

        /* stage 7

        cd .\Safety-net-study-repository\	// Navigate to repository

        git switch 0.2.x-dev			// Switch to branch 0.2.x-dev
        git branch 0.2.x			// Create new branch 0.2.x from 0.2.x-dev
        git switch 0.2.x			// Switch to branch 0.2.x

        // Fix the bug in case_operations.py in make_upper function
        git add
        git commit -m "fix: bug-fix make_upper"	// Commit change with message

        end stage 7*/

    }
}