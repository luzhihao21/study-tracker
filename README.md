# 📘 学習進捗トラッカー / Study Progress Tracker / 学习进度表

[![Java](https://img.shields.io/badge/Java-21-blue.svg)](https://adoptium.net/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.0-green.svg)](https://spring.io/projects/spring-boot)
[![MySQL](https://img.shields.io/badge/MySQL-8.0-orange.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

> 学習記録を管理するウェブアプリ / A web app for managing study records / 一款管理学习记录的网页应用

---

## 📱 デモ / Demo / 演示

| 機能 | 説明 |
|------|------|
| カレンダー | 学習状況をヒートマップで可視化 |
| タスク管理 | 日付ごとにタスクを追加・完了 |
| バイリンガル | 日本語/中国語 切り替え対応 |
| バックアップ | JSONエクスポート/インポート |

---

## 🚀 使用技術 / Tech Stack / 技术栈

### バックエンド / Backend / 后端

| 技術 | バージョン |
|------|-----------|
| Java | 21 |
| Spring Boot | 3.2.0 |
| MySQL | 8.0 |
| Maven | 3.9+ |

### フロントエンド / Frontend / 前端

| 技術 |
|------|
| HTML5 / CSS3 |
| JavaScript (ES6) |
| Fetch API |

---

## 📦 機能一覧 / Features / 功能列表

| 日本語 | English | 中文 |
|--------|---------|------|
| タスクの追加・削除・完了 | Add/Delete/Complete tasks | 任务的增删改查 |
| カレンダー上の学習記録をヒートマップ表示 | Heatmap calendar for study records | 热力图日历可视化 |
| 日本語/中国語切り替え | Japanese/Chinese toggle | 中日双语切换 |
| JSONデータバックアップ | JSON data backup | JSON数据备份 |
| 学習連続日数カウント | Study streak counter | 连续学习天数统计 |

---

## 🛠️ 環境構築 / Setup / 环境搭建

### 必要条件 / Requirements / 要求

- Java 21
- MySQL 8.0
- Maven 3.9+

### インストール手順 / Installation / 安装步骤

**1. リポジトリをクローン / Clone repository / 克隆仓库**

```bash
git clone https://github.com/luzhihao21/study-tracker.git
cd study-tracker
**2. データベース設定 / Database setup / 数据库配置**
CREATE DATABASE study_db;
**3. アプリケーションプロパティ設定 / Application properties / 配置文件
src/main/resources/application.properties を編集：
spring.datasource.url=jdbc:mysql://localhost:3306/study_db
spring.datasource.username=root
spring.datasource.password=your_password
**4. バックエンド起動 / Start backend / 启动后端
cd study-backend
mvn spring-boot:run
**5. フロントエンド起動 / Start frontend / 启动前端
VS Code で study-cloud.html を開く
Live Server で起動
**6. ブラウザでアクセス / Access in browser / 浏览器访问
http://localhost:8080 (backend)
http://localhost:5500/study-cloud.html (frontend)
📁 プロジェクト構造 / Project Structure / 项目结构
study-tracker/
├── study-cloud.html          # フロントエンド / Frontend
├── study-backend/            # バックエンド / Backend
│   ├── src/main/java/com/study/
│   │   ├── StudyApplication.java
│   │   ├── controller/
│   │   │   └── TaskController.java
│   │   ├── model/
│   │   │   └── Task.java
│   │   └── repository/
│   │       └── TaskRepository.java
│   └── src/main/resources/
│       └── application.properties
└── README.md
🌐 API エンドポイント / API Endpoints / API接口
Method	Endpoint	説明
GET	/api/tasks?date={date}	指定日のタスク取得
GET	/api/tasks/all	全タスク取得
POST	/api/tasks	タスク追加
PUT	/api/tasks/{id}/toggle	完了状態切替
DELETE	/api/tasks/{id}	タスク削除
🎯 今後の計画 / Future Plans / 后续计划
React でフロントエンドを書き換え

ポモドーロタイマー追加

学習時間統計グラフ

クラウドデプロイ

👨‍💻 作者 / Author / 作者
luzhihao21

GitHub: @luzhihao21

📄 ライセンス / License / 许可证
MIT License

Copyright (c) 2025 luzhihao21

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

⭐ 応援よろしくお願いします！
このプロジェクトが役に立ったら、⭐️を付けてください！
If this project helps you, please give it a star!
如果这个项目对你有帮助，请点个星标！
