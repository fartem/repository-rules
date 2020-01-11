Commit Convention
=======================

How to work with a project
-------------------

__New update__

1. pull or copy the project files from the repository to a workspace;
2. create a new branch for an update;
3. complete the update;
4. perform a Code Review;
5. merge your branch with `master`;
6. delete your branch.

**Notes**

1. always delete development branches;
2. always push only last commit to `master`.

Merge all dev branches in master
-------------------

__IDEA__

1. checkout `master` branch;
2. select `VCS` in menu;
3. select `Git`;
4. select `Merge changes`;
5. check `Squash commit`;
6. click on `Merge`.

Branches
-------------------

**In projects using next types of branches:**

* `master` - master branch. Contains a production version of the project. Don't push working changes to `master`!
* `feature` - branch for a feature. Use for updates or fixes which are in developing.

Commit message
-------------------

**Recommended commit message head length:** `50` symbols.

Commit message structure
-------------------

**Template**

```
[DATE] [VERSION] [TYPE]: [HEAD MESSAGE]

[BODY MESSAGE]
```

**Example**

```
2019-05-12 Version 2.1.3: Fixed bugs in History

1. Added:
- invites in ShareFragment.

2. Fixed:
- item name in History;
- portion loading in History.

3. Updated:
- Google libraries (to 17.0.0+).

4. Deleted:
- unused strings.
```

**Order**

1. `Date` - always write a date. It is necessary for the convenience of finding a specific commit;
2. `Version` - needed to monitoring major chenges in commit;
3. `Short description` - briefly describe what was done in the commit (fit it in two lines, it is convenient when looking for changes in the repository);
4. `Added` - what was added in the commit;
5. `Fixed` - what was fixed in the commit;
6. `Updated` - what was updated in the commit;
7. `Deleted` - what was deleted in the commit.