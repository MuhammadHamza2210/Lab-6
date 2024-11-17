package ibrarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String libraryName;
    private List<LibraryBranch> branches;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.branches = new ArrayList<>();
    }

       public String getLibraryName() {
        return libraryName;
    }

    public void addBranch(LibraryBranch branch) {
        branches.add(branch);
    }

    public void displayBranches() {
        System.out.println("Branches in " + libraryName + ":");
        for (LibraryBranch branch : branches) {
            System.out.println("- " + branch.getBranchName());
        }
    }
}
