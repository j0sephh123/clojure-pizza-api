(ns pizza-api.core-test
  (:require [clojure.test :refer :all]
            [ring.mock.request :as mock]
            [pizza-api.core :refer :all]))

(deftest test-root-route
  (testing "GET /"
    (let [response (app (mock/request :get "/"))]
      (is (= 200 (:status response)))
      (is (= "Hello World" (:body response))))))
