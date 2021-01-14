# Commit Convention

## How to work with a project

### As a repository maintainer

__New update__

1. clone a project from a repository to local workspace;
2. create a new branch for an update;
3. complete the update;
4. perform a Code Review;
5. merge your branch with `master`;
6. delete your branch.

__Notes__

1. always delete development branches;
2. always push squashed commit to `master`.

### As a contributor

1. clone a project from a repository to local workspace;
2. create a new branch for an update;
3. complete the update;
4. perform a Code Review;
5. create a Pull Request to the original repository.

## Merge all dev branches in master

__IDEA__

1. checkout `master` branch;
2. select `VCS` in menu;
3. select `Git`;
4. select `Merge changes`;
5. check `Squash commit`;
6. click on `Merge`.

## Branches

__In projects using next types of branches:__

* `master` - master branch. Contains a production version of the project. Don't push working changes to `master`!
* `feature/version` - branch for a feature. Use for updates or fixes which are in developing. Can be named as project version.

## Commit message

__Recommended commit head message length:__ `50` symbols.

## Commit message structure

__Template__

```
[DATE] ([VERSION] or [TYPE]): [HEAD OF MESSAGE]

1. Added:
- first addition;
- ...

2. Closed:
- first issue;
- ...

3. Fixed:
- first fix;
- ...

4. Updated:
- first update;
- ...

5. Deleted:
- first deletion;
- ...

6. Refactored:
- first refactor position;
- ...
```

__Example__

```
2019-05-12 Version 2.1.3: Fixed bugs in History screen

1. Added:
- AdaptiveRecyclerView library support.

2. Fixed:
- items naming in History;
- portion loading in History.

3. Updated:
- Google libraries (to 17.0.0+).

4. Deleted:
- unused strings.
```

__Commit body sections order__

1. `Added` - what was added in the commit;
2. `Closed` - what issues closed in the commit;
3. `Fixed` - what was fixed in the commit;
4. `Updated` - what was updated in the commit;
5. `Deleted` - what was deleted in the commit;
6. `Refactored` - what was refactored in the commit.
