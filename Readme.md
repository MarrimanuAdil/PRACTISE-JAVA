# Git Basics 🚀

Git is a distributed version control system that helps track changes in code, collaborate with teams, and manage project history.
Below are some *basic Git commands* and their uses:

---

## 🔹 Configuration


git config --global user.name "Your Name"
git config --global user.email "your@email.com"


👉 Sets up your identity for commits.

---

## 🔹 Starting a Repository


git init


👉 Initialize a new Git repository in the current folder.


git clone <repo_url>


👉 Copy (clone) an existing repository from GitHub/GitLab/Bitbucket.

---

## 🔹 Staging & Committing


git status


👉 Shows the status of changes (tracked/untracked/staged).


git add <file>
git add .


👉 Stages changes (single file or all files).


git commit -m "Commit message"


👉 Saves staged changes with a message.

---

## 🔹 Branching & Merging


git branch


👉 Lists branches in the repo.


git branch <branch_name>


👉 Creates a new branch.


git checkout <branch_name>
git switch <branch_name>


👉 Moves to another branch.


git merge <branch_name>


👉 Merges the specified branch into the current branch.

---

## 🔹 Remote Repositories


git remote -v


👉 Shows the connected remote repository.


git push origin <branch_name>


👉 Uploads local commits to the remote repo.


git pull origin <branch_name>


👉 Fetches + merges changes from remote to local.


git fetch


👉 Downloads changes but does not merge them.

---

## 🔹 Undoing Changes


git reset <file>


👉 Unstage a file (but keep changes).


git checkout -- <file>


👉 Discard changes in a file.


git revert <commit_id>


👉 Creates a new commit that undoes a previous commit.

---

## 🔹 Logs & History


git log


👉 Shows commit history.


git diff


👉 Shows differences between changes.

---

## ⚡ Quick Workflow


git clone <repo_url>
git checkout -b feature-branch
# make changes
git add .
git commit -m "Added new feature"
git push origin feature-branch


---

✅ With these commands, you can handle most day-to-day Git operations.