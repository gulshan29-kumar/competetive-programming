#include <bits/stdc++.h>
using namespace std;
#define int long long
const int inf = 4e18;
const int MOD = 1e9 + 7;
using ull = unsigned long long;
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};
int dxx[8] = {2, 2, -2, -2, 1, -1, 1, -1};
int dyy[8] = {1, -1, 1, -1, 2, 2, -2, -2};
const int N = 1e6 + 7;
struct DSU
{
    vector<int> fa, p, e, f;
    DSU(int n)
    {
        fa.resize(n + 1);
        iota(fa.begin(), fa.end(), 0);
        p.resize(n + 1, 1);
        e.resize(n + 1);
        f.resize(n + 1);
    }
    int get(int x)
    {
        while (x != fa[x])
        {
            x = fa[x] = fa[fa[x]];
        }
        return x;
    }
    bool merge(int x, int y)
    {
        if (x == y)
            f[get(x)] = 1;
        x = get(x), y = get(y);
        e[x]++;
        if (x == y)
            return false;
        if (x < y)
            swap(x, y);
        fa[y] = x;
        f[x] |= f[y], p[x] += p[y], e[x] += e[y];
        return true;
    }
    bool same(int x, int y)
    {
        return get(x) == get(y);
    }
    bool F(int x)
    {
        return f[get(x)];
    }
    int size(int x)
    {
        return p[get(x)];
    }
    int E(int x)
    {
        return e[get(x)];
    }
};
struct st
{
    int id, z;
    bool operator<(const st &b) const
    {
        return z < b.z;
    }
};
struct Tree
{
    int n;
    vector<vector<int>> ver, val;
    vector<int> lg, dep;
    vector<int> siz;
    Tree(int n)
    {
        this->n = n;
        ver.resize(n + 1);
        val.resize(n + 1, vector<int>(30));
        lg.resize(n + 1);
        dep.resize(n + 1);
        siz.resize(n + 1, 1);
        for (int i = 1; i <= n; i++)
        {
            lg[i] = lg[i - 1] + (1 << lg[i - 1] == i);
        }
    }
    void add(int x, int y)
    {
        ver[x].push_back(y);
        ver[y].push_back(x);
    }
    void dfs(int x, int fa)
    {
        val[x][0] = fa;
        dep[x] = dep[fa] + 1;
        for (int i = 1; i <= lg[dep[x]]; i++)
        {
            val[x][i] = val[val[x][i - 1]][i - 1];
        }
        for (auto y : ver[x])
        {
            if (y == fa)
                continue;
            dfs(y, x);
            siz[x] += siz[y];
        }
    }
    int lca(int x, int y)
    {
        if (dep[x] < dep[y])
            swap(x, y);
        while (dep[x] > dep[y])
        {
            x = val[x][lg[dep[x] - dep[y]] - 1];
        }
        if (x == y)
            return x;
        for (int k = lg[dep[x]] - 1; k >= 0; k--)
        {
            if (val[x][k] == val[y][k])
                continue;
            x = val[x][k];
            y = val[y][k];
        }
        return val[x][0];
    }
    int hz(int x, int y)
    {
        if (x == y)
        {
            return 0;
        }
        if (dep[x] < dep[y])
            swap(x, y);
        for (int k = lg[dep[x] - dep[y]] - 1; k >= 0; k--)
        {
            if (dep[val[x][k]] > dep[y])
            {
                x = val[x][k];
            }
        }
        return x;
    }
    int clac(int x, int y)
    {
        return dep[x] + dep[y] - 2 * dep[lca(x, y)];
    }
    void work(int root = 1)
    {
        dfs(root, 0);
    }
};
struct SCC
{
    int n, now, cnt;
    vector<vector<int>> ver;
    vector<int> dfn, low, col, S;
    SCC(int n) : n(n), ver(n + 1), low(n + 1)
    {
        dfn.resize(n + 1, -1);
        col.resize(n + 1, -1);
        now = cnt = 0;
    }
    void add(int x, int y)
    {
        ver[x].push_back(y);
    }
    void tarjan(int x)
    {
        dfn[x] = low[x] = now++;
        S.push_back(x);
        for (auto y : ver[x])
        {
            if (dfn[y] == -1)
            {
                tarjan(y);
                low[x] = min(low[x], low[y]);
            }
            else if (col[y] == -1)
            {
                low[x] = min(low[x], dfn[y]);
            }
        }
        if (dfn[x] == low[x])
        {
            int pre;
            cnt++;
            do
            {
                pre = S.back();
                col[pre] = cnt;
                S.pop_back();
            } while (pre != x);
        }
    }
    void work()
    {
        int m;
        cin >> m;
        for (int i = 0; i < m; ++i)
        {
            int u, v;
            cin >> u >> v;
            add(u, v);
        }
        for (int i = 1; i <= n; i++)
        {
            if (dfn[i] == -1)
            {
                tarjan(i);
            }
        }
        vector<int> siz(cnt + 1);
        vector<vector<int>> adj(cnt + 1);
        vector<int> in(cnt + 1, 0);
        vector<int> out(cnt + 1, 0);
        vector<int> dp(cnt + 1, 0);
        for (int i = 1; i <= n; i++)
        {
            siz[col[i]]++;
            for (auto j : ver[i])
            {
                int x = col[i];
                int y = col[j];
                if (x != y)
                {
                    adj[x].push_back(y);
                    // in[y]++;
                    out[x]++;
                }
            }
        }
        for (int i = 1; i <= cnt; ++i)
        {
            adj[i].erase(unique(adj[i].begin(), adj[i].end()), adj[i].end());
            for (int v : adj[i])
            {
                in[v]++;
            }
        }
        int ans = 0;
        int res = 0;
        for (int i = 1; i <= cnt; ++i)
        {
            if (out[i] == 0)
            {
                ans = siz[i];
                ++res;
                if (res == 2)
                {
                    cout << 0 << '
';
                    return;
                }
            }
        }
        cout << ans << '
';
    }
};
struct V_DCC
{
    int n;
    vector<vector<int>> ver, col;
    vector<int> dfn, low, S;
    int now, cnt;
    vector<bool> point;
    V_DCC(int n) : n(n)
    {
        ver.resize(n + 1);
        dfn.resize(n + 1);
        low.resize(n + 1);
        col.resize(2 * n + 1);
        point.resize(n + 1);
        S.clear();
        cnt = now = 0;
    }
    void add(int x, int y)
    {
        if (x == y)
            return;
        ver[x].push_back(y);
        ver[y].push_back(x);
    }
    void tarjan(int x, int root)
    {
        low[x] = dfn[x] = ++now;
        S.push_back(x);
        if (x == root && !ver[x].size())
        {
            ++cnt;
            col[cnt].push_back(x);
            return;
        }
        int flag = 0;
        for (auto y : ver[x])
        {
            if (!dfn[y])
            {
                tarjan(y, root);
                low[x] = min(low[x], low[y]);
                if (dfn[x] <= low[y])
                {
                    flag++;
                    if (x != root || flag > 1)
                    {
                        point[x] = true;
                    }
                    int pre = 0;
                    cnt++;
                    do
                    {
                        pre = S.back();
                        col[cnt].push_back(pre);
                        S.pop_back();
                    } while (pre != y);
                    col[cnt].push_back(x);
                }
            }
            else
            {
                low[x] = min(low[x], dfn[y]);
            }
        }
    }
    pair<int, vector<vector<int>>> rebuild()
    {
        work();
        vector<vector<int>> adj(cnt + 1);
        for (int i = 1; i <= cnt; i++)
        {
            if (!col[i].size())
            {
                continue;
            }
            for (auto j : col[i])
            {
                if (point[j])
                {
                    adj[i].push_back(point[j]);
                    adj[point[j]].push_back(i);
                }
            }
        }
        return {cnt, adj};
    }
    void work()
    {
        int m;
        cin >> m;
        for (int i = 0; i < m; ++i)
        {
            int u, v;
            cin >> u >> v;
            add(u, v);
            // add(v,u);
        }
        for (int i = 1; i <= n; ++i)
        {
            if (!dfn[i])
            {
                tarjan(i, i);
            }
        }
        vector<int> ls;
        for (int i = 1; i <= n; ++i)
        {
            if (point[i])
            {
                ls.push_back(i);
            }
        }
        cout << (int)ls.size() << '
';
        for (auto it : ls)
        {
            cout << it << " ";
        }
        cout << '
';
    }
};
template <class T>
struct Segt_
{
    struct node
    {
        int l, r;
        T w, add, mul = 1; // 注意初始赋值
    };
    vector<T> w;
    vector<node> t;
    Segt_(int n)
    {
        w.resize(n + 1);
        t.resize((n << 2) + 1);
        build(1, n);
    }
    Segt_(vector<int> in)
    {
        int n = in.size() - 1;
        w.resize(n + 1);
        for (int i = 1; i <= n; i++)
        {
            w[i] = in[i];
        }
        t.resize((n << 2) + 1);
        build(1, n);
    }
    void pushdown(node &p, T add, T mul)
    {
        p.w = p.w * mul + (p.r - p.l + 1) * add;
        p.add = p.add * mul + add;
        p.mul *= mul;
    }
    void pushup(node &p, node &l, node &r)
    {
        p.w = l.w + r.w;
    }
#define GL (k << 1)
#define GR (k << 1 | 1)
    void pushdown(int k)
    {
        pushdown(t[GL], t[k].add, t[k].mul);
        pushdown(t[GR], t[k].add, t[k].mul);
        t[k].add = 0, t[k].mul = 1;
    }
    void pushup(int k)
    {
        pushup(t[k], t[GL], t[GR]);
    }
    void build(int l, int r, int k = 1)
    {
        if (l == r)
        {
            t[k] = {l, r, w[l]};
            return;
        }
        t[k] = {l, r};
        int mid = (l + r) / 2;
        build(l, mid, GL);
        build(mid + 1, r, GR);
        pushup(k);
    }
    void modify(int l, int r, T val, int k = 1)
    {
        if (l <= t[k].l && t[k].r <= r)
        {
            t[k].w += (t[k].r - t[k].l + 1) * val;
            t[k].add += val;
            return;
        }
        pushdown(k);
        int mid = (t[k].l + t[k].r) / 2;
        if (l <= mid)
            modify(l, r, val, GL);
        if (mid < r)
            modify(l, r, val, GR);
        pushup(k);
    }
    void modify2(int l, int r, T val, int k = 1)
    {
        if (l <= t[k].l && t[k].r <= r)
        {
            t[k].w *= val;
            t[k].add *= val;
            t[k].mul *= val;
            return;
        }
        pushdown(k);
        int mid = (t[k].l + t[k].r) / 2;
        if (l <= mid)
            modify2(l, r, val, GL);
        if (mid < r)
            modify2(l, r, val, GR);
        pushup(k);
    }
    T ask(int l, int r, int k = 1)
    {
        if (l <= t[k].l && t[k].r <= r)
        {
            return t[k].w;
        }
        pushdown(k);
        int mid = (t[k].l + t[k].r) / 2;
        T ans = 0;
        if (l <= mid)
            ans += ask(l, r, GL);
        if (mid < r)
            ans += ask(l, r, GR);
        return ans;
    }
    void debug(int k = 1)
    {
        cout << "[" << t[k].l << ", " << t[k].r << "]: ";
        cout << "w = " << t[k].w << ", ";
        cout << "add = " << t[k].add << ", ";
        cout << "mul = " << t[k].mul << ", ";
        cout << endl;
        if (t[k].l == t[k].r)
            return;
        debug(GL), debug(GR);
    }
};
vector<int> ss;
vector<int> prim;
void init()
{
    prim.resize(N, 0);
    for (int i = 2; i < N; ++i)
    {
        if (prim[i] == 0)
        {
            prim[i] = i;
            ss.push_back(i);
        }
        for (int x : ss)
        {
            if (i * x >= N)
            {
                break;
            }
            prim[i * x] = x;
            if (i % x == 0)
            {
                break;
            }
        }
    }
}
void solve()
{
    int n;
    cin >> n;
    int m = n / 2;
    cout << m * (n - m) << '
';
}
signed main()
{
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    int t = 1;
    // init();
    cin >> t;
    while (t--)
    {
        solve();
    }
    return 0;
}