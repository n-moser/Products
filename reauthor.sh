git filter-branch --env-filter '

an="$GIT_AUTHOR_NAME"
am="$GIT_AUTHOR_EMAIL"
cn="$GIT_COMMITTER_NAME"
cm="$GIT_COMMITTER_EMAIL"

if [ "$GIT_COMMITTER_NAME" = "Nicolas Moser" ]
then
cm="nico@moser-home.de"
fi

if [ "$GIT_AUTHOR_NAME" = "Nicolas Moser" ]
then
am="nico@moser-home.de"
fi

export GIT_AUTHOR_EMAIL=$am
export GIT_COMMITTER_EMAIL=$cm
'