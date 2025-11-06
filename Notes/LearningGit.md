# Learning Git


## Creating the Local Repository

Step 1: Check that you are in the primary working directory of your project

    Terminal Command: pwd

Step 2: initialization the folder with  (This is Local) 

    Terminal Command: git init


Step 3: Add your files that you want to commit
    
    Terminal Command: Git add


Step 4: Create a Git Commit & add a Message

    Terminal Command: Git Commit -m "..."


## Incorporating GitHub

Precursor: Confirm you are logged into GH

    Terminal Command : gh auth login

Creating the Repository

    Terminal Command: gh repo create *name of repo* --public --source=. --remote=origin

Pushing the Repository

    Terminal Command: git push -u origin *branch name*