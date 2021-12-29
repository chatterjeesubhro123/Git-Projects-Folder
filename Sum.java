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


