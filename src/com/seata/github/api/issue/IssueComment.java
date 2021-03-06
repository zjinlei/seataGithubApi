package com.seata.github.api.issue;

import java.util.List;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

public class IssueComment {

    private int id;
    private String html_url;
    private String body;
    private int issueId;

    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static class User {
        private String login;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }
    }

    public static void main(String[] args) {
        String issue = "[{\"url\":\"https://api.github.com/repos/seata/seata/issues/comments/629581248\"," +
            "\"html_url\":\"https://github.com/seata/seata/issues/2689#issuecomment-629581248\",\"issue_url\":\"https://api.github.com/repos/seata/seata/issues/2689\",\"id\":629581248,\"node_id\":\"MDEyOklzc3VlQ29tbWVudDYyOTU4MTI0OA==\",\"user\":{\"login\":\"Garlichead\",\"id\":45086633,\"node_id\":\"MDQ6VXNlcjQ1MDg2NjMz\",\"avatar_url\":\"https://avatars2.githubusercontent.com/u/45086633?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/Garlichead\",\"html_url\":\"https://github.com/Garlichead\",\"followers_url\":\"https://api.github.com/users/Garlichead/followers\",\"following_url\":\"https://api.github.com/users/Garlichead/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/Garlichead/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/Garlichead/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/Garlichead/subscriptions\",\"organizations_url\":\"https://api.github.com/users/Garlichead/orgs\",\"repos_url\":\"https://api.github.com/users/Garlichead/repos\",\"events_url\":\"https://api.github.com/users/Garlichead/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/Garlichead/received_events\",\"type\":\"User\",\"site_admin\":false},\"created_at\":\"2020-05-16T03:26:49Z\",\"updated_at\":\"2020-05-16T03:26:49Z\",\"author_association\":\"NONE\",\"body\":\"\uD83D\uDD96\uD83C\uDFFD\"},{\"url\":\"https://api.github.com/repos/seata/seata/issues/comments/629909356\",\"html_url\":\"https://github.com/seata/seata/issues/2689#issuecomment-629909356\",\"issue_url\":\"https://api.github.com/repos/seata/seata/issues/2689\",\"id\":629909356,\"node_id\":\"MDEyOklzc3VlQ29tbWVudDYyOTkwOTM1Ng==\",\"user\":{\"login\":\"a364176773\",\"id\":19943636,\"node_id\":\"MDQ6VXNlcjE5OTQzNjM2\",\"avatar_url\":\"https://avatars3.githubusercontent.com/u/19943636?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/a364176773\",\"html_url\":\"https://github.com/a364176773\",\"followers_url\":\"https://api.github.com/users/a364176773/followers\",\"following_url\":\"https://api.github.com/users/a364176773/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/a364176773/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/a364176773/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/a364176773/subscriptions\",\"organizations_url\":\"https://api.github.com/users/a364176773/orgs\",\"repos_url\":\"https://api.github.com/users/a364176773/repos\",\"events_url\":\"https://api.github.com/users/a364176773/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/a364176773/received_events\",\"type\":\"User\",\"site_admin\":false},\"created_at\":\"2020-05-18T02:16:23Z\",\"updated_at\":\"2020-05-18T02:16:23Z\",\"author_association\":\"CONTRIBUTOR\",\"body\":\"can you elaborate on that\"},{\"url\":\"https://api.github.com/repos/seata/seata/issues/comments/630524493\",\"html_url\":\"https://github.com/seata/seata/issues/2689#issuecomment-630524493\",\"issue_url\":\"https://api.github.com/repos/seata/seata/issues/2689\",\"id\":630524493,\"node_id\":\"MDEyOklzc3VlQ29tbWVudDYzMDUyNDQ5Mw==\",\"user\":{\"login\":\"lightClouds917\",\"id\":33415199,\"node_id\":\"MDQ6VXNlcjMzNDE1MTk5\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/33415199?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/lightClouds917\",\"html_url\":\"https://github.com/lightClouds917\",\"followers_url\":\"https://api.github.com/users/lightClouds917/followers\",\"following_url\":\"https://api.github.com/users/lightClouds917/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/lightClouds917/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/lightClouds917/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/lightClouds917/subscriptions\",\"organizations_url\":\"https://api.github.com/users/lightClouds917/orgs\",\"repos_url\":\"https://api.github.com/users/lightClouds917/repos\",\"events_url\":\"https://api.github.com/users/lightClouds917/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/lightClouds917/received_events\",\"type\":\"User\",\"site_admin\":false},\"created_at\":\"2020-05-19T01:40:07Z\",\"updated_at\":\"2020-05-19T01:48:35Z\",\"author_association\":\"CONTRIBUTOR\",\"body\":\"我尝试解答下你的疑问：\\r\\n**1.这是源代码和注释**\\r\\n`       \\r\\n            // the lock should release after branch commit\\r\\n            // Highlight: Firstly, close the session, then no more branch can be registered.\\r\\n            // 1.分支事务提交后释放锁；\\r\\n            // 2.关闭全局session（active=false）,这样就不会注册新分支了；\\r\\n            globalSession.closeAndClean();\\r\\n`\\r\\n**2.globalSession.closeAndClean()内部**\\r\\n`    public void closeAndClean() throws TransactionException {\\r\\n        //关闭GlobalSession，状态置为active=false\\r\\n        close();\\r\\n        //清理此全局事务上所有分支事务的行锁，lockTable表中\\r\\n        clean();\\r\\n    }\\r\\n`\\r\\n**3.close方法**\\r\\n`\\r\\n@Override\\r\\n    public void onClose(GlobalSession globalSession) throws TransactionException {\\r\\n        globalSession.setActive(false);\\r\\n    }\\r\\n`\\r\\n这里就是把全局事务关闭了，这样分支事务就不能注册了\\r\\n**4.clean方法**\\r\\n你追下去发现最终落在\\r\\n`delete from  #lock_table#  where xid = ? and branch_id in ( #in_params# )`\\r\\n这里是删除分支事务的行锁\\r\\n**5.close方法中，active=false，为什么就不能注册了呢？**\\r\\n在一阶段，分支事务注册方法里，方法最前面有这么个方法\\r\\n`            globalSessionStatusCheck(globalSession);\\r\\n`\\r\\n这个方法是检查全局事务状态的，如果全局事务状态active=false，会报错的,方法实现为：\\r\\n`    protected void globalSessionStatusCheck(GlobalSession globalSession) throws GlobalTransactionException {\\r\\n        if (!globalSession.isActive()) {\\r\\n            throw new GlobalTransactionException(GlobalTransactionNotActive, String.format(\\r\\n                \\\"Could not register branch into global session xid = %s status = %s, cause by globalSession not active\\\",\\r\\n                globalSession.getXid(), globalSession.getStatus()));\\r\\n        }\\r\\n        if (globalSession.getStatus() != GlobalStatus.Begin) {\\r\\n            throw new GlobalTransactionException(GlobalTransactionStatusInvalid, String\\r\\n                    .format(\\\"Could not register branch into global session xid = %s status = %s while expecting %s\\\",\\r\\n                            globalSession.getXid(), globalSession.getStatus(), GlobalStatus.Begin));\\r\\n        }\\r\\n    }\\r\\n`\\r\\n群里的朋友有时候会遇到分支事务无法注册的错误，原因就在这里。\\r\\n\"},{\"url\":\"https://api.github.com/repos/seata/seata/issues/comments/630525004\",\"html_url\":\"https://github.com/seata/seata/issues/2689#issuecomment-630525004\",\"issue_url\":\"https://api.github.com/repos/seata/seata/issues/2689\",\"id\":630525004,\"node_id\":\"MDEyOklzc3VlQ29tbWVudDYzMDUyNTAwNA==\",\"user\":{\"login\":\"lightClouds917\",\"id\":33415199,\"node_id\":\"MDQ6VXNlcjMzNDE1MTk5\",\"avatar_url\":\"https://avatars1.githubusercontent.com/u/33415199?v=4\",\"gravatar_id\":\"\",\"url\":\"https://api.github.com/users/lightClouds917\",\"html_url\":\"https://github.com/lightClouds917\",\"followers_url\":\"https://api.github.com/users/lightClouds917/followers\",\"following_url\":\"https://api.github.com/users/lightClouds917/following{/other_user}\",\"gists_url\":\"https://api.github.com/users/lightClouds917/gists{/gist_id}\",\"starred_url\":\"https://api.github.com/users/lightClouds917/starred{/owner}{/repo}\",\"subscriptions_url\":\"https://api.github.com/users/lightClouds917/subscriptions\",\"organizations_url\":\"https://api.github.com/users/lightClouds917/orgs\",\"repos_url\":\"https://api.github.com/users/lightClouds917/repos\",\"events_url\":\"https://api.github.com/users/lightClouds917/events{/privacy}\",\"received_events_url\":\"https://api.github.com/users/lightClouds917/received_events\",\"type\":\"User\",\"site_admin\":false},\"created_at\":\"2020-05-19T01:41:52Z\",\"updated_at\":\"2020-05-19T01:41:52Z\",\"author_association\":\"CONTRIBUTOR\",\"body\":\"@tanjiaxin1999 上面的回答，你可以跟下源码，和注释做的事情，还是比较一致的。如果有什么问题，再继续交流。\"}]\n";

        List<IssueComment> issueComments = new Gson().fromJson(issue, new TypeToken<List<IssueComment>>() {
        }.getType());
        System.out.println(issueComments.size());
    }
}
