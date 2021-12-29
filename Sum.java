class Sum{
    public static void main(String[] args) {
    int a=5,b=6;
    System.out.println("The sum after changing is "+(a+b));
}
}

// git init -> initializes a repository in the github
// git status-.tells that what are the chnages tat are done in the current repository

// to commit or add files we use -> git add <filename>
// now while we write git status then it shows the file that is been added

/*
        |--working area
        |
git add |->staging area--|
                         |git commit
           repository <--- */

        //    staging area holds the changes before commiting to the git repository

        // suppose there are 40 files,we want to commit 14 of them,then at first we use git add for staging then git commit for commiting the files into the repository
// git commit -m "initial message"
// after -m "here we write any meaningful message to be shown"
        // [master (root-commit) 86914b5] initial commit
//  1 file changed, 11 insertions(+)
//  create mode 100644 Sum.java

// git log -> to see how many commits are done where and how
// clear -> clears git bash command screen

// as currently newly created file is not added to the staging area,so on using git status it shows the newly created untracked files

// fish shell-> to be installed for autocomplete features

// when we use commit,every time new hex code generated and shown on the browser

// git add . -> means it adds al files to the staging environment

// if we want to go to any particular commit then we should write
// git checkout <commit hash code/branch name> for coming to the initial position

// git switch - -> to abort the operation of checkout and comeback to the current position of the files

// we can use git checkout master as well
// git branch -> branches are shown from the master
// checkout is for searching elements from branch to another branch

// from master branch we can create multiple branches,generally branches are there for going deep to create a new file in any branch,to come back to master we must use -> git checkout master

// to create branch we use -> git branch <branchname>

// to checkout in the branch we use -> git checkout <branchname>

// to create branch and checkout in it at the same time we use -> git checkout -b <name/branchname>
// we can use it as Subhro/multiply or only multiply,the first one is useful for maintaininga  special format

// so whatever change is made on any branch is not known to another branch

// after creatinga nd updating the files in the branch subhro/multiply,now we will take the branch to the "dev" branch,so we will go to the dev branch and use git merge <branch name>

// so now the subhro/multiply branch will be merged in the dev branch

// now after adding the details from the subhro/multiply to the dev branch
// now we will be merfging the dev brancxh to the main master branch by using git merge <branchname> here it is dev